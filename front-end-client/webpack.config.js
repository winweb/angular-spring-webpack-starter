var path = require("path");
var webpack = require("webpack");
var output = "target/classes/static";

module.exports = {
    entry: "./app/main.js",
    output: {
        path: path.join(__dirname, output),
        filename: "bundle.js"
    },
    module: {
        loaders: [
            {test: /\.html$/, loader: "file?name=[name].[ext]"}
        ]
    }
};