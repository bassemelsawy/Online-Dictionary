window.onload = function () {

    var searchBtn = $("#searchBtn");

    searchBtn.click(function () {
        var inputValue = $("#lookupInput").val();
        console.log(inputValue);
        $.ajax({
            url: "search",
            type: 'GET',
            data: {"searchString": inputValue},
            success: function (data) {
                $('#result').html(data);
            }

        });
    });


}