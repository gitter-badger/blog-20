var http = require('http');

http.createServer(function (request, response) {

    var body = [];

    console.log(request.method);

    /**
     * 当请求体数据到来时，该事件被触发，该事件提供一个参数chunk，
     * 表示接受的数据，如果该事件没有被监听，则请求体会被抛弃，
     * 该事件可能会被调用多次（这与nodejs是异步的有关系）
     */
    request.on('data', function (chunk) {
        console.log("data")
        body.push(chunk);
    });

    /**
     * 当请求体数据传输完毕时，该事件会被触发，此后不会再有数据
     */
    request.on('end', function () {
        console.log("end")
        response.end();
    });
    /**
     * 用户当前请求结束时，该事件被触发，不同于end，如果用户强制终止了传输，也是用close
     */
    request.on('close', function () {
        console.log("close")
        response.end();
    });

}).listen(8080);

console.log("服务器启动成功：http://localhost:8080/");