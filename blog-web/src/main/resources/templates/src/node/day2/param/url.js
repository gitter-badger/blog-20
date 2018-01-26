/**
 * http://nodejs.cn/api/url.html#url_class_url
 * url 模块提供了一些实用函数，用于 URL 处理与解析。
 *
 * url模块提供了两套API来处理URLs
 * >一个是Node.js遗留的特有的API
 * >一个则是通常使用在web浏览器中 实现了WHATWG URL Standard的API.
 *
 * 请注意: 虽然Node.js遗留的特有的API并没有被弃用，但是保留的目的是用于向后兼容已有应用程序。
 * 因此新的应用程序请使用WHATWG API。
 */
/**
 * Node.js遗留的特有的API
 */
var url = require('url');
var obj = url.parse('https://user:pass@sub.host.com:8080/p/a/t/h?query=string#hash');
console.log(obj);
/*
{
    href: 'https://user:pass@sub.host.com:8080/p/a/t/h?query=string#hash',
    origin: 'https://sub.host.com:8080',
    protocol: 'https:',
    username: 'user',
    password: 'pass',
    host: 'sub.host.com:8080',
    hostname: 'sub.host.com',
    port: '8080',
    pathname: '/p/a/t/h',
    search: '?query=string',
    searchParams: URLSearchParams { 'query' => 'string' },
    hash: '#hash'
}
*/

/**
 * 实现了WHATWG URL Standard的API.(新版本推荐)
 * ES6语法
 */
const {URL} = require('url');
const myURL = new URL('https://user:pass@sub.host.com:8080/p/a/t/h?query=string#hash');

console.log(myURL)

/*
{
    href: 'https://user:pass@sub.host.com:8080/p/a/t/h?query=string#hash',
    origin: 'https://sub.host.com:8080',
    protocol: 'https:',
    username: 'user',
    password: 'pass',
    host: 'sub.host.com:8080',
    hostname: 'sub.host.com',
    port: '8080',
    pathname: '/p/a/t/h',
    search: '?query=string',
    searchParams: URLSearchParams { 'query' => 'string' },
    hash: '#hash' }*/
