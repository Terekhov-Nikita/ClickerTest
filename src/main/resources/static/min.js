$.ajax({
    url: '/click',
    type: 'GET',
    dataType: 'text'
})
    .done(function(data) {
        $('#count-text').html(data+" times")
    })
    .fail(function(data) {
        console.log(data);
    })
$( "button" ).on( "click", notify );


function notify() {
    $.ajax({
        url: '/click',
        type: 'POST',
        dataType: 'text'
    })
        .done(function(data) {
            $('#count-text').html(data+" times")
        })
        .fail(function(data) {
            console.log(data);
        })
}
