import "../index.html";
import angular from "angular";
import HelloController from "./hello.js";
import "purecss";
import "font-awesome-webpack";

angular.module("app", [])
    .controller("HelloController", HelloController);
