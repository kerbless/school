document.getElementById("fibonacci").addEventListener("click", function() {
    var n = parseInt(document.getElementById("n").value);
    var a = b = 1;
    for (var i = 2; i < n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    document.getElementById("risultato").innerHTML = c;
});