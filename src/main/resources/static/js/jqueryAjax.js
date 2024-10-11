$(document).ready(function() {
    $('#jqueryForm').submit(function(event) {
        event.preventDefault();

        const name = $('#name').val().trim();
        const email = $('#email').val().trim();
        const message = $('#message').val().trim();

        const data = { name, email, message };

        $.ajax({
            url: '/api/submitData',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function(response) {
                $('#jqueryResponse').text(response.message);
                $('#jqueryForm')[0].reset();
            },
            error: function() {
                $('#jqueryResponse').text('Wystąpił błąd podczas przesyłania danych.');
            }
        });
    });
});
