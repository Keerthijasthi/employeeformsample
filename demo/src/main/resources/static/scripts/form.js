document.addEventListener("DOMContentLoaded", function() {
    const form = document.querySelector("form");

    form.addEventListener("submit", function(event) {
        // Clear previous error messages
        const errorMessages = document.querySelectorAll(".error-message");
        errorMessages.forEach(function(error) {
            error.remove();
        });

        let isValid = true;

        const nameField = document.querySelector("input[name='name']");
        const emailField = document.querySelector("input[name='email']");
        const departmentField = document.querySelector("input[name='department']");

        if (nameField.value.trim() === "") {
            isValid = false;
            showError(nameField, "Name is required");
        }

        if (emailField.value.trim() === "") {
            isValid = false;
            showError(emailField, "Email is required");
        }

        if (departmentField.value.trim() === "") {
            isValid = false;
            showError(departmentField, "Department is required");
        }

        if (!isValid) {
            event.preventDefault();
        }
    });

    function showError(field, message) {
        const error = document.createElement("div");
        error.className = "error-message";
        error.style.color = "red";
        error.textContent = message;
        field.parentNode.insertBefore(error, field.nextSibling);
    }
});
