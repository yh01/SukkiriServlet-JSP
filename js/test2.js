/**
 *
 */
createsvg2();

function createsvg2(){
	var dataset = [];
	for(var i =0; i <= 5; i++){
		var newN = Math.random() * 30;
		dataset = dataset.concat(newN);
	}
	d3.select("#result").selectAll("div")
	.data(dataset)
	.enter()
	.append("div")
	.attr("id","result")
	.style("height",function(d){
		var barHeight = d * 3;
		return barHeight + "px";
	});


	/*
	.text(function(d){
		return d + "です";
	})
	.style("color",function(d){
		if(d > 15){
			return "red";
		}else{
			return "black";
		}
	});
	*/
}
