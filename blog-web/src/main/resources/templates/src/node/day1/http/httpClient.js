var http = require('http');

var request = http.request({
    hostname: 'localhost',
    port: 8080,
    path: '/',
    method: 'POST',
    headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
    }
}, function (response) {
    console.log(response)

});

request.end();

/*http.get('http://localhost:8080/',function (response) {
    console.log(response)
});*/



