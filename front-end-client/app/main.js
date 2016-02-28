import "../index.html";
import angular from "angular";
import HelloController from "./hello.js";
import "purecss";
import "font-awesome-webpack";

angular.module("app", [])
    .controller("HelloController", HelloController);

var env = process.env.NODE_ENV;

if (env === "production") {
    console.log("PROD MODE");
} else {
    console.log("NOT PROD MODE")
}
