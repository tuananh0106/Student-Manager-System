function validateForm(){

}

function validateDate(){
    var el_button = document.getElementById("submit_create_student_id");
    el_button.onclick = fillDateNow;

    function fillDateNow() {
        var today = new Date().toISOString().substring(0, 19)
        document.getElementById("date_of_birth").value = today;
    }
}