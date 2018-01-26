/**
 * http://nodejs.cn/api/querystring.html
 * querystring 模块提供了一些实用函数，用于解析与格式化 URL 查询字符串。
 */
var querystring = require('querystring');
var assert = require('assert');

var str = querystring.stringify({id: 1, name: 'xxx'});
console.log(str);
str = querystring.parse(str);
console.log(str);
str = querystring.stringify({id: 1, name: 'xxx'}, ';', ',');
console.log(str);
console.log(__filename);
console.log(__dirname);


