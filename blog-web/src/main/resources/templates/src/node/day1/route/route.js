module.exports = {
    '/login':function (req,res) {
        res.write("调用登陆方法");
    }
    ,'/register':function (req,res) {
        res.write("调用注册方法，注册成功");
    }
}