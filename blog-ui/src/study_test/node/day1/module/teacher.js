var user = require('./user');

module.exports = function (id,name,age) {
    user.apply(this,[id,name,age]);
    this.teacherPrint = function () {
        console.log("调用teacher")
    }
}