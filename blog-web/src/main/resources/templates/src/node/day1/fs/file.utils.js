var fs = require('fs');
module.exports = {
    /**
     * 同步读取文件
     */
    readFileSync: function (fileName) {
        var data = fs.readFileSync(fileName, "utf-8");
        console.log("readFileSync读取完毕内容如下：");
        console.log(data);
    }
    , readFile: function (fileName) {
        fs.readFile(fileName, function (error, data) {
            if (error) {
                console.log("读取文件异常");
                console.log(error);
                return;
            }
            console.log("readFile读取完毕内容如下：")
            console.log(data.toString())
        });
    }
    ,readImg:function (imagName) {
        fs.readFile(imagName,'binary', function (error, data) {
            if (error) {
                console.log(error);
                return;
            }
            console.log(data.toString())
            console.log(data)
        });
    }
    , writeFileSync: function (fileName, data) {
        fs.writeFileSync(fileName, data)
        console.log("writeFileSync写文件完成");
    }
    ,writeFile:function (fileName,data) {
        fs.writeFile(fileName,data,function (error,data) {
            if (error){
                console.log("writeFile写入文件错误");
                console.log(error);
                return;
            }
            console.log("writeFile写文件完成",data);
        });
    }
    /**
     * copy小文件
     * @param resource 源文件
     * @param target 目标文件
     *
     * 使用fs.readFileSync读取到源文件，
     * 然后使用fs.writeFileSync将文件写入到自定位置
     *
     */
    , copyMinFile: function (resource, target) {
        fs.writeFileSync(target, fs.readFileSync(resource));
    }
    /**
     * copy大文件
     * @param resource 源文件
     * @param target 目标文件
     */
    , copyMaxFile: function (resource, target) {
        fs.createReadStream(resource).pipe(fs.createWriteStream(target));
    }


}