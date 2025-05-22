
function constructor() {
    this.init();
}


function init() {
    this.loadList();
}

function loadList(input) {
    let page = 0;
    input != undefined ? page = input : page = 1;
    $.ajax({
        url: "/board/list",
        type: "get",
        dataType: "json",
        data: {
            currentPage: page
        },
        success: function (data) {
            document.getElementById("tbody").innerHTML = "";
            data.data.forEach((data, index) => {
                   const tr = document.createElement("tr");
                   tr.innerHTML =
                    `<tr>
                        <td>${data.id}</td>
                        <td>${data.content}</td> 
                    </tr>`;
                    document.getElementById("tbody").appendChild(tr);
            })
            paging(data);

        }
    })
}

function paging(data) {
    document.getElementById("paging").innerHTML = "";
    for(i=1; i<=data.totalPage; i++) {
        const span = document.createElement("span");
        span.innerHTML = `<a href="#">${i}</a>`;
        document.getElementById("paging").appendChild(span);
    }
    document.getElementById("paging").addEventListener('click', () => {
        const clickedElement = event.target;
        loadList(clickedElement.innerHTML);
    }, {once: true});
}

init();