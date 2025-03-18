window.onload = function() {
    const mensagemErro = document.getElementById('mensagemErro');
    if (mensagemErro) {
        // Exibe a mensagem por 3 segundos e depois a esconde suavemente
        setTimeout(() => {
            mensagemErro.style.opacity = '0';  // Reduz a opacidade para desaparecer
        }, 3000); // Tempo em milissegundos (3 segundos)
    }
};