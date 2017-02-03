function isEmail(email) {
    var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email);
}

if( !validateEmail(emailaddress)) { /* do stuff here */ }
/**
 * Created by KevinFechtel on 2/2/17.
 */
