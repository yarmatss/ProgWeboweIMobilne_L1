document.addEventListener("DOMContentLoaded", function() {
    const form = document.querySelector("form");
    form.addEventListener("submit", function(event) {
        let valid = true;
        const name = document.getElementById("name").value.trim();
        const email = document.getElementById("email").value.trim();
        const password = document.getElementById("password").value.trim();

        // Reset error messages
        document.querySelectorAll(".error").forEach(function(el) {
            el.textContent = "";
        });

        if (name === "") {
            showError("name", "Imię jest wymagane");
            valid = false;
        }

        if (email === "") {
            showError("email", "Email jest wymagany");
            valid = false;
        } else if (!validateEmail(email)) {
            showError("email", "Niepoprawny format email");
            valid = false;
        }

        if (password.length < 8) {
            showError("password", "Hasło musi mieć co najmniej 8 znaków");
            valid = false;
        }

        if (!valid) {
            event.preventDefault();
        }
    });

    function showError(fieldId, message) {
        const field = document.getElementById(fieldId);
        let errorDiv = field.nextElementSibling;
        if (!errorDiv || !errorDiv.classList.contains("error")) {
            errorDiv = document.createElement("div");
            errorDiv.classList.add("error");
            field.parentNode.insertBefore(errorDiv, field.nextSibling);
        }
        errorDiv.textContent = message;
    }

    function validateEmail(email) {
        const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(String(email).toLowerCase());
    }
});