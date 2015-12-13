setInterval(ucitajCitulje, 1000);
var citulje;

$(document).ready(function() {
            
        });

var arrSlobodna;
var arrUkupna;
var imena;
function nacrtajChart(){
    
     arrSlobodna = [];

            for (var i = 0; i < citulje.length; i++) {
                var y = 0
                arrSlobodna.push({
                    label: i+1,
                    y: citulje[i].brojSlobodnihMesta
                     
                });
            };

arrUkupna = [];

            for (var i = 0; i < citulje.length; i++) {
                var y = 0
                arrUkupna.push({
                    label: i+1,
                    y: citulje[i].brojMesta

                });
           
            };

var chart = new CanvasJS.Chart("chartContainer");

    chart.options.axisY = { prefix: "Broj mesta: " };
    chart.options.title = { text: "Trenutno stanje u citkama" };

    var series1 = { //dataSeries - first quarter
        type: "column",
        name: "Slobodna mesta",
        showInLegend: true
    };

    var series2 = { //dataSeries - second quarter
        type: "column",
        name: "Ukupna broj mesta",
        showInLegend: true
    };

    chart.options.data = [];
    chart.options.data.push(series1);
    chart.options.data.push(series2);


    series1.dataPoints = arrSlobodna;

    series2.dataPoints = arrUkupna;

    chart.render();

}

function ucitajCitulje(){
	$.ajax({
        url: "http://10.29.20.112:8084/Hakaton2015/rest/ustanova/",
        type: 'GET',
        headers: {
        	"Authorization" : "VE9LRU4jIzE=",
        	"content-type" : "application/json"
        },
        success: function(data){
        		citulje = data;
                napuniCitulje(data);
                nacrtajChart();
                addMarker(lokacije);
        },
         error: function (xhr, ajaxOptions, thrownError) {
		    // alert(xhr.status);
		    // alert(thrownError);
  		}
    });
}

function napuniCitulje(c) {
    if (typeof c !== "undefined") {
        var table = document.getElementById('tblCitulje');
        table.innerHTML = "";
        var table_body = document.createElement('TBODY');
        table.appendChild(table_body);
        var tHead = document.createElement('THEAD');
        var arrSlobodnaayHeader = ["R.br","Ime", "Broj mesta", "Slobodna"];

        for (var i = 0; i < arrSlobodnaayHeader.length; i++) {
            tHead.appendChild(document.createElement("TH")).appendChild(document.createTextNode(arrSlobodnaayHeader[i]));
        }
        tHead.appendChild(document.createElement("TH")).appendChild(document.createTextNode(""));
        tHead.appendChild(document.createElement("TH")).appendChild(document.createTextNode(""));
        for (var x = 0; x < c.length; x++) {
            
            var tr = document.createElement('TR');
            tr.id = "citulja" + x;
            tr.className = "tooltip2";
            tr.title= c[x].opis;
            table_body.appendChild(tr);
           
            for (var j = 0; j < 4; j++) {
                var td = document.createElement('TD');
                switch (j) {
                    case 0:
                        td.appendChild(document.createTextNode(x+1 +"."));
                        break;
                    case 1:
                        td.id = "td_id_" + c[x].id;
                        td.appendChild(document.createTextNode(c[x].nazivUstanove));
                        break;
                    case 2:
                        td.appendChild(document.createTextNode(c[x].brojMesta));
                        break;
                    case 3:
                        td.appendChild(document.createTextNode(c[x].brojSlobodnihMesta));
                        break;
                    default:
                }
                tr.appendChild(td);
            }
        }
        table.appendChild(tHead);
    }
}

// za brisanje terena
$(function() {
    $(document).on('click', '[id^=citulja]', function() {
       
        var index = $(this).text();



        
        
    });
});

$('.tooltip2').tooltipster({
                animation: 'grow',
                theme: 'tooltipster-punk',
                  position: 'top-left'
            });