var mysqlpool = require('./../db/mySQLPool');

var mySQLPool = new mysqlpool();
var pool = mySQLPool.getPool();

function operation() {
    this.insert = function (sql, param, fun) {
        pool.getConnection(function (error, con) {
            if (error) {
                throw error;
            }
            con.query(sql, param, function (error, rs) {
                if (typeof fun === 'function') {
                    fun(error,rs);
                }
                con.release();
            });
        });
    }

    this.query = function (sql, param, fun) {
        pool.getConnection(function (error, con) {
            con.query(sql, param, function (error, rs, fields) {
                if (typeof fun === 'function') {
                    fun(error,rs, fields);
                }
                con.release();
            });
        });
    }

}

module.exports = operation;
