/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function getIntradayValues(shareTime) {
    axios.get('/shares/' + shareTime + '/' + document.getElementById("inputShare").value)
            .then(function (response) {
                document.getElementById("tableDiv").innerHTML = "";
                var tableContent = document.getElementById("tableDiv");
                var valuesTable = document.createElement("table");
                valuesTable.setAttribute("class", "table")
                
                
                var titlesTable = ["Time", "Open", "High", "Low", "Close", "Volume"];
                
                var titleRow = document.createElement("tr");
                
                for(var x in titlesTable){
                    var titleColumn = document.createElement("th");
                    titleColumn.innerHTML = titlesTable[x];
                    titleRow.appendChild(titleColumn);
                }
                
                valuesTable.appendChild(titleRow);
                
                for(var x in response.data){
                    if(x.includes("Time Series")){
                        for(var y in response.data[x]){
                            var mainRow = document.createElement("tr");
                            var timeRow = document.createElement("td");
                            timeRow.innerHTML = y;
                            mainRow.appendChild(timeRow);
                            valuesTable.appendChild(mainRow);
                            for(var z in response.data[x][y]){
                                var valueShare = document.createElement("td");
                                valueShare.innerHTML = response.data[x][y][z];
                                mainRow.appendChild(valueShare);
                            }
                        }
                    }
                }
                
                tableContent.appendChild(valuesTable);
            });

}
