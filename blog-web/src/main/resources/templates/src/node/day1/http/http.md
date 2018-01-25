官方文档：https://nodejs.org/api/http.html

* ####  'http'模块提供两种使用方式：

作为服务端使用时，创建一个HTTP服务器，监听HTTP客户端请求并返回响应。

作为客户端使用时，发起一个HTTP客户端请求，获取服务端响应。


> ### 创建一个简单的http服务

```
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

console.log("启动服务成功：http://localhost:8080")
```

* #### 启动后的第一次请求结果

![输入图片说明](https://gitee.com/uploads/images/2018/0125/105710_12072660_966228.png "屏幕截图.png")

* #### require('http') 

表示导入一个http库，相当java中的import,然后就可以使用该库中提供的方法

* #### http.createServer(function(request,response)).listen(8080)

使用http库中的createServer创建一个http服务,然后调用listen监听8080端口

* request：浏览器向服务器发送请求对象

  * request.method : 获取请求类型，如，get/post

  * request.headers : 获取请求头，请求体

  * request.url ： 过去请求地址


* response：服务器向浏览器返回对象

  * response.writeHead: 该方法的第一个参数表示HTTP的响应状态（200）表示一切正常；第二个参数是“Content-Type”，表示我响应给客户端的内容类型

  * response.write : 写入我们需要传递给客户端的内容

  * response.end : 表示此次请求已处理完成。 **不写会没有http协议尾浏览器会一直打转转 ![输入图片说明](https://gitee.com/uploads/images/2018/0125/105120_a873307a_966228.png "屏幕截图.png")；但是写了会造成两次访问；** 

> ### http客户端的使用

http模块提供了两个函数 http.request和 http.get，功能是作为客户端向http服务器发起请求。


* #### http.request(options,callback)

options是一个类似关联数组的对象，表示请求的参数，callback作为回调函数，需要传递一个参数，为http.ClientResponse的实例，http.request返回一个http.ClientRequest的实例。

options常用的参数有host、port（默认为80）、method（默认为GET）、path（请求的相对于根的路径，默认是“/”，其中querystring应该包含在其中，例如/search?query=byvoid）、headers（请求头内容）

```
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
```

* #### http.get(options,callback)

```
http.get('http://localhost:8080/',function (response) {
    console.log(response)
});
```

这个方法是http.request方法的简化版，唯一的区别是http.get自动将请求方法设为了GET请求，同时不需要手动调用req.end()，但是需要记住的是， **如果我们使用http.request方法时没有调用end方法，服务器将不会收到信息。** 


