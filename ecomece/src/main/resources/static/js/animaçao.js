window.onload = function() {
    const mensagemErro = document.getElementById('mensagemErro');
    if (mensagemErro) {
        
        setTimeout(() => {
            mensagemErro.style.opacity = '0';  
        }, 1000); 
    }

    const input = document.getElementById("nome")
    input.addEventListener("focus", () => {
        input.classList.remove("hover:bg-gray-300");
    })
    input.addEventListener("focus", () => {
        input.classList.add("hover:bg-gray-300");
    })
};