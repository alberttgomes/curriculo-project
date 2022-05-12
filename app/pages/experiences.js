import React, { useState, useEffect } from 'react';

import { View, Text, ScrollView } from 'react-native';

import { ExperiencesGet } from './request';

const Experiences = () => {
    
    const [getExperiences, setGetExperiences] = useState([]);
    
    useEffect(() => {
        ExperiencesGet().then(res => {
            setGetExperiences(res.item)
        })
    }, []);
     
    return(
        <View style={styles.container}>
            <Text style={styles.text}>
                Experiencias
            </Text>
            <ScrollView>
                {getExperiences.map(getExperiences => (
                    <View key={getExperiences.id}>
                        <Text>Empresa: {getExperiences.jobs}</Text>
                        <Text>Atividades: {getExperiences.tracks}</Text>
                        <Text>Período: {getExperiences.time}</Text>
                    </View>
                ))}
            </ScrollView>
        </View>
    );
}

const styles = StyleSheet({
    container: {
        flex: 1
    },
    text: {
        fontSize: 25,
        fontWeight: 'bold'
    }
})

export default Experiences;