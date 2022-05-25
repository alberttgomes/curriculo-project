import React from 'react';

import { Text, View, StyleSheet, FlatList, SafeAreaView } from 'react-native';

import Theme from '../components/theme';

const data = [
    {
       id: 1,
       experience: "Sistemas Para Internet",
       time: "2020 - 2022"
    }, 
    {  
       id: 2,
       experience: "Project Extension FACEPE | Neurotech",
       time: "4 mounths"
    }, 
    {  
       id: 3,
       experience: "Resident of Software at Porto Digital",
       time: "Three Course Time"
    }
];

const Item = ({ experience, time }) => (
    <View>
        <Text>{experience}</Text>
        <Text>{time}</Text>
    </View>
);


const AcademicScreen = () => {
    
    const renderItem = ({ item }) => {
        <Item 
            experience={item.experience}
            time={item.time}
        />
    }
    
    return(
        <SafeAreaView theme={Theme.backgroundcolor} style={styles.container}>
            
            <Text style={styles.text}>Experiences Academics</Text>
            
            <View style={styles.container}>
                
                <Text>Course</Text>
                
                <FlatList
                    style={styles.flat}
                    data={data}
                    renderItem={renderItem}
                    keyExtractor={item => item.id}
                    theme={Theme.primary}
                />

            </View>

        </SafeAreaView>
    );
}

const styles = StyleSheet.create({
    container: {
        flex:1
    },
    text:{
        fontSize: 32,
        fontWeight: 'bold'
    },
    flat:{
        flex: 1,
        marginTop: 3,
        borderRadius: 5
    }
});

export default AcademicScreen;