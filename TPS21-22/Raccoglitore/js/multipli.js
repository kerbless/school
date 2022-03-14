document.getElementById("calc").addEventListener("click", function() {
    var n = parseInt(document.getElementById("n").value);
    var x = parseInt(document.getElementById("x").value);
    if (x > n) {
        var ris = "";
        for (var i = n; i < x; i += n) {
            ris = ris + " " + i;
        }
        document.getElementById("risultato").innerHTML = ris;
    } else {
        document.getElementById("risultato").innerHTML = "x deve essere maggiore di n";
    }

});