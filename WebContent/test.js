/**
 *
 */
createsvg();

function createsvg(){
	var svg = d3.select("#example").append("svg")
		.attr({
			width: 640,
			height: 480,
		});

	var c1 = [100,90,30];
	var c2 = [200,120,20];
	var c3 = [300,150,20];
	var c4 = [400,200,20];
	var c5 = [500,100,20];
	var c6 = [600,70,20];
	var carray = [c1,c2,c3,c4,c5,c6];
	var color = d3.scale.category10();


//線
	var line = d3.svg.line()
	//.interpolate('basis')で線を滑らかにできる
		.x(function(d){return d[0];})
		.y(function(d){return d[1];});
	var path = svg.append('path')
	.attr({
		'd' : line(carray),
		'stroke': 'lightgreen',
		'stroke-width': 5,
		'fill': 'none',
	});
//線



//文字
	var g = svg.selectAll('g')
	.data(carray).enter().append('g')
	.attr({
		transform: function(d){
			return "translate(" + d[0] + "," + d[1] + ")";
		},
	});

	g.append('circle')
		.attr({
			'r' : function(d) { return d[2]; },
			'fill' : function(d,i) { return color(i); },
		});
	g.append('text')
		.attr({
			'text-anchor': "middle",
			'dy': ".35em",
			'fill': "white",
		})
		.text(function(d,i) {return i+1;});
//文字




//色
	var circle = svg.selectAll('circle').data(carray).enter().append('circle')
	.attr({
		'cx' : function(d){ return d[0]; },
		'cy' : function(d){ return d[1]; },
		'r' : function(d){ return d[2]; },
		'fill' : function(d,i) {return color(i); },
	})
//色
}