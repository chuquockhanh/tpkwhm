(function($){$.fn.retina=function(retina_part){var settings={'retina_part':'@2x'};if(retina_part)jQuery.extend(settings,{'retina_part':retina_part});if(window.devicePixelRatio>=2){this.each(function(index,element){if(!$(element).attr('data-src'))return;var checkForRetina=new RegExp("(.+)("+settings['retina_part']+"\\.\\w{3,4})");if(checkForRetina.test($(element).attr('data-src')))return;var new_image_src=$(element).attr('data-src').replace(/(.+)(\.\w{3,4})$/,"$1"+settings['retina_part']+"$2");$(element).attr('src',new_image_src);});}else{this.each(function(index,element){$(element).attr('src',$(element).attr('data-src'));});}
    return this;}})(jQuery);