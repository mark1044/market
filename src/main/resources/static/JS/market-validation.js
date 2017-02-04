jQuery(".email-validation").submit(function( event ) {

    if (validateEmail(jQuery("input:first").val()) == true ) {
        //jQuery( "span" ).text( "Validated..." ).show();
        //return;
    }

    //jQuery("span").text("Not a valid email").show().fadeOut(1000);
    event.preventDefault();
});


function validateEmail(email) {
    var regex = /^[a-z0-9!$'*+\-_]+(\.[a-z0-9!$'*+\-_]+)*@([a-z0-9]+(-+[a-z0-9]+)*\.)+([a-z]{2}|aero|arpa|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|travel)$/;
    return regex.test(email);
}

if( !validateEmail(email)) { /* do stuff here */ }
/**
 * Created by KevinFechtel on 2/2/17.
 */

/**
 * on document load -) short hand
 */
jQuery(function(){
    /**
     * when the document loads this anonymous method
     * ** Event listeners are kept in this method
     */

    /**
     * because classes can result in a set of elements this following may not
     * work, may need modification
     */

    /**
     * there are many event listeners, the one you want is the one that is triggered
     * when text is changed in a text box
     */

    /**
     jQuery(".email-validation").click(function(){

        //get text from input text
       //validate text
      //give out put message

        alert("mantis");


    });
     **/

});