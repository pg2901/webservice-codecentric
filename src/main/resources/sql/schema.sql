CREATE TABLE IF NOT EXISTS feedback (
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    rating INT NOT NULL,
    text TEXT NOT NULL
);
