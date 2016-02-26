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
            {test: /\.css$/, loader: "style!css"},
            {test: /\.html$/, loader: "file?name=[name].[ext]"},
            // font awesome
            {test: /\.woff(2)?(\?v=[0-9]\.[0-9]\.[0-9])?$/, loader: "url-loader?limit=10000&minetype=application/font-woff"},
            {test: /\.(ttf|eot|svg)(\?v=[0-9]\.[0-9]\.[0-9])?$/, loader: "file-loader"}
        ]
    }
};