function memberList() {
    $.ajax({
        type:'GET',
        url:'/user/list'

    }).done(function(data){
	
        //tt = document.getElementById('tarea')
        //tt.text = data
        console.log(data)
		$('#tarea').text(JSON.stringify(data));
		        
    }).fail(function(error){

    });
}