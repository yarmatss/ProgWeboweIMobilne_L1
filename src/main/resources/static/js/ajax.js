document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("ajaxForm");
    form.addEventListener("submit", function(event) {
        event.preventDefault();

        const name = document.getElementById("name").value.trim();
        const email = document.getElementById("email").value.trim();
        const message = document.getElementById("message").value.trim();

        const data = { name, email, message };

        fetch('/api/submitData', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        })
            .then(response => response.json())
            .then(data => {
                document.getElementById("response").innerText = data.message;
                form.reset();
            })
            .catch(error => {
                console.error('Error:', error);
                document.getElementById("response").innerText = "Wystąpił błąd podczas przesyłania danych.";
            });
    });
});
