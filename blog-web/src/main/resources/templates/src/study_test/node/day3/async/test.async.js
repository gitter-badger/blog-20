var async = require('async');

async.series({
    one: function(callback){
       setTimeout(function () {
           callback(null, 1);
       },3000)
    },
    two: function(callback){
        callback(null, 2);
    }
},function(err, results) {
    console.log(results);
});