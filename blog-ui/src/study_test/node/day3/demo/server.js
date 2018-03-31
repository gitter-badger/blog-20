var http = require('http');
var url = require('url');
var querystring = require('querystring');
var async = require('async');
var dbutils = require('./sql.utils');

var db = new dbutils();
var resultJson = {status: 200, msg: '', data: null};
var route = {
    addUser: function (req, res, param) {
        var sqlParam = [param.userName, param.password, param.iphone];
        httpSimpleProx(req, res, function () {
            db.insert("INSERT INTO blog_user (`user_name`, `pwd`, `iphone`) VALUES (?,?,?)", sqlParam, function (error, rs) {
                if (error) {
                    console.log(error);
                    resultJson.status = 400;
                    resultJson.msg = "服务器异常";
                } else {
                    resultJson.msg = "添加成功";
                    resultJson.data = rs;
                }
                res.write(JSON.stringify(resultJson));
                res.end();
            });

        })
    }
    , updateUser: function (req, res, param) {
        httpSimpleProx(req, res, function () {
            db.query("UPDATE blog_user SET user_name = ?,pwd = ?,iphone=? WHERE id = ?",
                [param.userName, param.password, param.iphone, param.id],
                function (error, rs) {
                    if (error) {
                        console.log(error);
                        resultJson.status = 400;
                        resultJson.msg = "服务器异常";
                    } else {
                        resultJson.msg = "修改成功";
                        resultJson.data = rs;
                    }
                    res.write(JSON.stringify(resultJson));
                    res.end();
                });
        });
    }
    , delUser: function (req, res, param) {
        httpSimpleProx(req, res, function () {
            db.query("DELETE  FROM blog_user WHERE id = ?", [param.id], function (error, rs) {
                if (error) {
                    console.log(error);
                    resultJson.status = 400;
                    resultJson.msg = "服务器异常";
                } else {
                    resultJson.msg = "删除成功";
                    resultJson.data = rs;
                }
                res.write(JSON.stringify(resultJson));
                res.end();
            });
        });
    }
    , queryUser: function (req, res) {
        httpSimpleProx(req, res, function () {
            db.query("SELECT * FROM blog_user", null, function (error, rs) {
                if (error) {
                    console.log(error);
                    resultJson.status = 400;
                    resultJson.msg = "服务器异常";
                } else {
                    resultJson.msg = "查询成功";
                    resultJson.data = rs;
                }
                res.write(JSON.stringify(resultJson));
                res.end();
            });
        });
    }
}

function httpSimpleProx(req, res, fun) {
    res.writeHead(200, {
        'Content-Type': 'application/json;charset=utf-8',
        'Access-Control-Allow-Credentials': true,
        'Access-Control-Allow-Origin': '*' //可以是*，也可以是跨域的地址
    });
    if (typeof fun === 'function') {
        fun(req, res);
    }
    //res.end();
}

http.createServer(function (request, response) {
    if (request.url !== '/favicon.ico') {
        var param = '';
        var pathName = url.parse(request.url).pathname;
        pathName = pathName.indexOf('/') === 0 ? pathName.replace('/', '') : pathName;
        console.log("请求:" + pathName);

        param = url.parse(request.url).query || '';

        request.on('data', function (chunk) {
            param += chunk;
        })

        request.on('end', function () {
            param = querystring.parse(param);
            console.log("接收参数", param);
            try {
                route[pathName](request, response, param);
            } catch (e) {
                console.log(e);
                response.write('404 Not Found URL.');
                response.end();
            }
        })
    }


}).listen(8000);

console.log("服务器启动成功 http://localhost:8000/");