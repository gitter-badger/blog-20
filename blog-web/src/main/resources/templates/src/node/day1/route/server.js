var http = require('http');
var url = require('url');
var querystring=require("querystring");
var route = require('./route');
http.createServer(function (request, response) {
    response.writeHead(200, {'Content-type': 'text/html;charset=utf-8'});

    if (request.url !== '/favicon.ico') {
        var pathName = url.parse(request.url).pathname;
        var arg = querystring.parse(url.parse(request.url).query);
        console.log("请求参数",arg);
        try{
            route[pathName](request,response);
        }catch (e){
            response.write(String(e));
        }
        response.end();
    }

}).listen(8080);

console.log("启动成功 http://localhost:8080/");