module.exports= function (id,name,age) {
    this.id = id;
    this.name = name;
    this.age = age;

    this.print = function() {
        console.log("编号",this.id,"姓名",this.name,"年龄",this.age)
    }
}
