import "../index.html";
import angular from "angular";
import HelloController from "./hello.js";

angular.module("app", [])
    .controller("HelloController", HelloController);
