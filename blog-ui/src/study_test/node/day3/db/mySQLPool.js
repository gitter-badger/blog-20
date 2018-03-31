var mysql = require('mysql');

function optPool() {
    this.flag = true;
    //创建一个连接池
    this.pool = mysql.createPool({
        host: 'localhost',
        port: '3306',
        user: 'root',
        password: '5322',
        database: 'blog_test'
    });

    this.getPool = function () {
        //初始化连接池
        if (this.flag === true) {
            //监听连接事件
            this.pool.on('connection', function (con) {
                con.query('SELECT SESSION auto_increment_increment=1');
                this.flag = false;
            });
        }
        return this.pool;
    }
}

module.exports = optPool;