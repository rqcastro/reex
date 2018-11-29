$(document).ready(function() {
    $('button.clientes').click(function() {
            console.log($('form').serialize());
            $.ajax({
                url: '/reex/add',
                data: $('form.cliente').serialize(),
                type: 'GET',
                success: function(response) {
                    console.log(response);
                },
                error: function(error) {
                    console.log(error);
                }
            });
     });

     $('button.corretores').click(function() {
         $.ajax({
             url: '/reex/addBroker',
             data: $('form.corretor').serialize(),
             type: 'GET',
             success: function(response) {
                 console.log(response);
             },
             error: function(error) {
                 console.log(error);
             }
         });
     });


});
