define([
    'module',
    '{angular}/angular'
], function (module, angular) {
    'use strict';

    var demoModule = angular.module('demo', []),
        config = module && module.config() || {};

    // module code goes here

    return {
        angularModules: ['demo']
    };
});