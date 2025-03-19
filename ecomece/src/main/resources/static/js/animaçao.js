window.onload = function() {
    const mensagemErro = document.getElementById('mensagemErro');
    if (mensagemErro) {
        
        setTimeout(() => {
            mensagemErro.style.opacity = '0';  
        }, 1000); 
    }
};