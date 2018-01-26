var http = require('http');
var url = require('url');
var querystring = require('querystring');
http.createServer(function (request, response) {
    var pathName = url.parse(request.url).pathname;
    response.writeHead(200, {'Content-type': 'text/html;charset=utf-8'});
    if (pathName !== '/favicon.ico') {
        /**
         * 获取get请求参数
         */
        var type = request.method;
        var param = url.parse(request.url, true).query;
        console.log("当前请求" + type + "，使用GET方式获取参数", param);
        /**
         * 获取post请求参数
         * post请求参数的获取和get不同，get是通过url解析获取，参数大小有限，
         * post可接收大量参数所以在获取的时候node提供了一个事件来获取
         * request.on('data',fun(chunk));
         * 这两个方法是异步执行
         */
        var postData = '';
        //post 请求触发，接收传输数据
        request.on('data', function (chunk) {
            postData += chunk;
            console.log("POST请求出发data事件", chunk.toString());
        })

        //传输数据结束后触发
        request.on('end', function () {
            console.log(postData)
            postData = querystring.parse(postData);
            console.log("当前请求" + type + "，使用POST方式获取参数", postData);
            console.log("------------------数据传输结束-------------------------------");
            response.write("get参数：" + JSON.stringify(param) + ",post参数：" + JSON.stringify(postData));
            response.end();
        });
    }
}).listen(8080);
console.log("启动成功 http://localhost:8080/");