import React from 'react';

import { Text, View, StyleSheet, FlatList } from 'react-native';

const data = [
   {
       university: "Sistemas Para Internet",
       resident: "Resident of Software at Porto Digital",
       projectExtension: "Project Extension FACEPE | Neurotech"
   }
]

const AcademicScreen = () => {
    return(
        <View style={styles.container}>
            
            <Text style={styles.text}>Experiences Academics</Text>
            
            <View style={styles.flat}>
                <Text>Course</Text>
                <FlatList
                    data={data}
                />
            </View>

        </View>
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