var http = require('http');

http.createServer(function (request, response) {
    response.writeHead(200, {'Content-Type': 'text/html;charset=utf-8'});
    console.log("请求地址：",request.url);

    //过滤2次请求
    if (request.url !== "/favicon.ico") {
        console.log("请求方法：",request.method);
        console.log("请求详细信息：",request.headers);
        console.log('访问');
        response.write('hello,world');
        //不写会导致http协议未结束，写了造成两次请求
        response.end('<br>本次访问结束');
    }

}).listen(8080);

console.log("启动服务成功：http://localhost:8080/")