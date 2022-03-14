document.getElementById("checkbutton").addEventListener("click", function() { check() });

function check() {
    var text = "";
    if (document.getElementById("Cognome").value == "")
        text += "Non hai inserito il tuo cognome\n";
    if (document.getElementById("Nome").value == "")
        text += "Non hai inserito il tuo nome\n";
    if (document.getElementById("Regione").options.length == 0)
        text += "Non hai selezionato una regione di residenza\n";
    if (document.getElementById("Uomo").checked == false && document.getElementById("Donna").checked == false && document.getElementById("Altro").checked == false)
        text += "Non hai selezionato il sesso\n";
    if (document.getElementById("Sport").value == "") // NON FUNZIONA
        text + "Non hai selezionato lo sport preferito\n";
    if (document.getElementById("Email").validity.valid) // NON FUNZIONA
        text + "Non hai inserito una email valida\n";
    if (document.getElementById("Privacy").checked == "")
        text += "Non hai accettato la privacy\n";
    text += "Gli altri campi sono compilati.";
    alert(text);
}