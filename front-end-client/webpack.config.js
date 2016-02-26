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
            {test: path.join(__dirname, "app"), loader: "babel", query: {presets: ["es2015"]}},
            {test: /\.html$/, loader: "file?name=[name].[ext]"}
        ]
    }
};