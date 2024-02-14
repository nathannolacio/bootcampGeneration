const nome = document.querySelector('#nomeCompleto')
const email = document.querySelector('#email')

function validarNome(){
    let txtNome = document.querySelector('#txtNome')
    if(nome.value.length < 5) {
        txtNome.innerHTML = "Digite o nome completo"
        txtNome.style.color = "red"
    } else{
        txtNome.innerHTML = "Válido!"
        txtNome.style.color = "green"
    }
}

function validarEmail() {
    let txtEmail = document.querySelector('#txtEmail')
    if(email.value.indexOf('@') && email.value.indexOf('.') == -1) {
        txtEmail.innerHTML = "Digite o email corretamente!"
        txtEmail.style.color = 'orange'
    } else {
        txtEmail.innerHTML = 'Email válido'
        txtEmail.style.color = 'green'
    }
}