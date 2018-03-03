//Copy to a new jsfiddle and send me the url of finished work. 
//write a function to add new child
//wirte a funciton to change a child's name

//Note: Do not make changes to this fidd
const profiles = [{
    name: 'john',
    age: 20,
    single: true,
    //funciton to change a child's name
    changeChildsName(name, newName) {
        if (this.hasOwnProperty(name)) {
            this.newName = this.name;
            delete this.name;
        }
    },
    'list of children': [{
        name: 'peter',
        age: 10
    }]
}];

// add a child to list of children
const addChild = function(profiles, name, age) {
    let child = {};
    child.name = name;
    child.age = age;
    profiles['list of children'].push(child);
    return profiles['list of children'];
};

console.info('AFTER adding a child');
console.table(addChild(profiles[0], 'Jim', 4));


profiles[0].changeChildsName('name', 'newName');
console.info('AFTER changing child\'s name');
console.log(JSON.stringify(profiles));