import React, { useState, useEffect } from 'react';

import { View, Text, Button, ScrollView } from 'react-native';

const Experiences = () => {
    const [getExperiences, setGetExperiences] = useState([]);
    
    useEffect(() => {}, []);
    
    return(
        <View>
            <Text>
                Experiencias
            </Text>
            <ScrollView>
                {getExperiences.map(getExperiences => (
                    <View key={getExperiences.id}>
                        <Text>Empresa: {getExperiences.company}</Text>
                        <Text>Atividades: {getExperiences.tracks}</Text>
                        <Text>Período: {getExperiences.time}</Text>
                    </View>
                ))}
            </ScrollView>
        </View>
    );
}

export default Experiences;