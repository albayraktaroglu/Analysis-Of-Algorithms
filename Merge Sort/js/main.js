var myarray = [5, 7, 2, 9, 6, 1, 3, 7];

var sort = function (whole) {
    //alert(whole.length);
    if (whole.length === 1) {
        return whole;
    }
    else {
        // divide array in half 
        var left = new Array(whole.length / 2);
        left = whole.slice(0,whole.length / 2);
       
        
        var right = new Array(whole.length - left.length);
        right = whole.slice(whole.length - left.length,whole.length);
        
    
    
        // sort both sides 
        left = sort(left);
        right = sort(right);
        
        // merge arrays 
        merge(left,right,whole);
        
        var node = document.createElement("LI");
        var textnode = document.createTextNode(whole);
        node.appendChild(textnode);
        document.getElementById("myList").appendChild(node);
       
        return whole;
    }
}

var merge = function(left, right, result){
    
    var x = 0;
    var y = 0;
    var k = 0;
    
    // if left and right has item
    while( x<left.length && y<right.length ){
        
        if( left[x] < right[y] ){
            result[k] = left[x];
            x++;
        }
        else{
            result[k] = right[y];
            y++;
        }
        k++;
        
    }
    
    var rest = [];
    var restIndex;
    
    if ( x>=left.legth ){
        rest = right;
        restIndex = y;
    }
    else{
        rest = left;
        restIndex = x;
    }
    
    for( var i=restIndex ; i<rest.length ; i++ ){
        result[k] = rest[i];
        k++;
    }
    
    
}
